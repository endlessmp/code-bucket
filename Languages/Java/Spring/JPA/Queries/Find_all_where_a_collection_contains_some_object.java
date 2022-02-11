	//Finds all Contacts which have a specific email in their collection of emails
@Query("From Contact c where :email member c.emails")
List<Contact> findAllWhereEmailsContainsEmail(Email email);