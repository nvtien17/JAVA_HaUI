package De01;
import java.util.List;

public interface MobileManager {
	public boolean addMobile(Mobile a);
	public boolean editMobile(Mobile a);
	public boolean delMobile(Mobile a);
	public List<Mobile> searchMobile (String name);
	public List<Mobile> sortedMobile (double price);
}
