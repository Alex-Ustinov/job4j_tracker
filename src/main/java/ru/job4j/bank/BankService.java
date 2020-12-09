package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if(!users.containsKey(user)) {
            users.put(user,new ArrayList<>());
        }
    }

    public void addAccount(String passport, Account account) {
        User searchUser = findByPassport(passport);
        if (users.containsKey(searchUser)) {
            List<Account> accountUser = users.get(searchUser);
            if (accountUser.size() > 0) {
                for (Account eachAccount : accountUser) {
                    if (!eachAccount.equals(account)) {
                        accountUser.add(account);
                        break;
                    }
                }
            } else {
                accountUser.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if(user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        User user = findByPassport(passport);
        if (users.containsKey(user)) {
            List<Account> accountUser = users.get(user);
            for (Account account : accountUser) {
                if(account.getRequisite().equals(requisite)) {
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
        if (srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}