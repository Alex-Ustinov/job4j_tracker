package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> searchUser = Optional.of(findByPassport(passport));
        if (searchUser.isPresent()) {
            List<Account> accountUser = users.get(searchUser);
            if (!accountUser.contains(account)) {
                accountUser.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        Optional<User> user = users
                .keySet()
                .stream()
                .filter(eachUser -> eachUser.getPassport().equals(passport))
                .findFirst();
    }

    public Account findByRequisite(String passport, String requisite) {
        Optional<User> user = Optional.of(findByPassport(passport));
        if (user.isPresent()) {
            List<Account> accountUser = users.get(user);
            return accountUser
                    .stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst().orElse(null);
        }
        return null;
    }


    public User findByPassportOLD(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisiteOLD(String passport, String requisite) {
        Account result = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accountUser = users.get(user);
            for (Account account : accountUser) {
                if (account.getRequisite().equals(requisite)) {
                    result = account;
                    break;
                }
            }
        }
        return result;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}