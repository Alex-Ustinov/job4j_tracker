package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getUsername().equals(login)) {
                rsl = users[i];
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("Element not found");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() < 3) {
            return true;
        } else {
            throw new UserInvalidException("User was not validated");
        }
    }

    public static void main(String[] args) throws UserNotFoundException, UserInvalidException {
        UserStore userStore = new UserStore();
        User[] users = {
            new User("Petr Arsentev", true)
        };
        try {
            User user = userStore.findUser(users, "Petr Arsentev");
            if (userStore.validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException exceptionIsNOtValid) {
            exceptionIsNOtValid.printStackTrace();
        } catch (UserNotFoundException exceptionUserNotFound) {
            exceptionUserNotFound.printStackTrace();
        }
    }
}
