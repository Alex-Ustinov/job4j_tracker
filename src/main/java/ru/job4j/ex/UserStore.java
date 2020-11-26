package ru.job4j.ex;

public class UserStore {
    public static User findUser(User [] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].equals(login)) {
                rsl = users[i];
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("Element not found");
        }
        return rsl;
    }

    public static boolean validate (User user) throws UserInvalidException {
        try {
            if(user.isValid() && user.getUsername().length() < 3) {
                return true;
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        User[] users = {
            new User("Petr Arsentev", true)
        };
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
    }
}
