package org.example;

public class AuthorizationPerson
{
        public boolean getCustomer(String login, String password, String confirmPassword)
        {
            try
            {
                checkLogin(login);
            } catch (WrongLoginExeption e)
            {
                System.out.println(e.getMessage());
            }
            try
            {
                checkPassword(password);
            } catch (WrongPasswordException e)
            {
                System.out.println(e.getMessage());
            }

            try
            {
                checkConfirm(password, confirmPassword);
            } catch (WrongConfirmExeption e)
            {
                System.out.println(e.getMessage());
            }

            return true;
        }

        public boolean checkLogin(String loging) throws WrongLoginExeption
        {
                if(loging.length() > 20)
                {
                    throw new WrongLoginExeption("Длина loging не должна превышать 20 символов!");
                }
            return true;
        }

        public  boolean checkPassword(String password) throws WrongPasswordException
        {
                if(password.length() > 20)
                {
                    throw new WrongPasswordException("Длина login не должна превышать 20 символов!");
                }
            return true;
        }

        public boolean checkConfirm(String password, String confirmPassword) throws WrongConfirmExeption {
            if (!confirmPassword.equals(password) || confirmPassword.length() > 20)
            {
                throw new WrongConfirmExeption("Пароль и его подтверждение не совпадают! или меньше 20 символов!");
            }
            return true;
        }
}
