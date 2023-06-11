package De01;
import java.util.*;
public class MobileManagerImpl implements  MobileManager{
	public static List<Mobile> mobiles = new ArrayList<>();
	@Override
	public boolean addMobile(Mobile a) {
		for (Mobile m : mobiles) {
			if(m.getProduct_Id().equals(a.getProduct_Id())) {
				return false;
			}
		}
		mobiles.add(a);
		return true;
	}
	@Override
	public boolean editMobile(Mobile a) {
		for(Mobile m : mobiles) {
			if(m.getProduct_Id().equals(a.getProduct_Id())){
				m.setProducer(a.getProducer());
				m.setProduct_name(a.getProduct_name());
				m.setProduct_price(a.getProduct_price());
				m.setProduct_total(a.getProduct_total());
				m.setType(a.getType());
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean delMobile(Mobile a) {
		for(Mobile m : mobiles) {
			if(m.getProduct_Id().equals(a.getProduct_Id())){
				mobiles.remove(m);
				return true;
			}
		}
		return false;
	}
	@Override
	public List<Mobile> searchMobile (String name){
		List<Mobile> searchList = new ArrayList<>();
		 for(Mobile m : mobiles) {
			 if(m.getProduct_name().toLowerCase().contains(name.toLowerCase())) {
				 searchList.add(m);
			 }
		 }
		 return searchList;
	}
	@Override
	public List<Mobile> sortedMobile (double price){
		List<Mobile> sortedList = new ArrayList<>(mobiles);
		Collections.sort(sortedList, (i1, i2) -> Double.compare(i1.getProduct_price(),i2.getProduct_price()));
		return sortedList;
	}
	public void printAll() {
		for(Mobile m : mobiles) {
			//m.toString();
			System.out.println(m);
		}
	}
}
