import java.util.Set;

public interface PassportDAO {
	void addPassport(Passport passportObj);
	void modifyPassport(Passport passportObj);
	void deletePassport(int passportId);
	Passport findPassport(int passportId);
	Set<Passport>findAllPassport();
	

}
