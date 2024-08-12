Feature: Test user registration process

  Background: 
    Given Open registration page

  Scenario: Validate registration
    When I enter the data as follows
      | Archi | Tiwari | archi@gmail.com | Pune   |
      | Raisa | Begum  | raisa@gmail.com | Wainad |
    Then Registration should success

  Scenario: Validate registration with another values
    When Enter following data
      | FirstName | LastName | MailId          | City     | MNo        |
      | Ankit     | Das      | ankit@gmail.com | Agartala | 9898989898 |
      | Ajay      | Sonavane | ajay@gmail.com  | Mumbai   | 7878787878 |
    Then Registration message should display
