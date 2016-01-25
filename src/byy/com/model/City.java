/**
 * 
 */
package byy.com.model;

/**
 * @author Administrator
 *
 */
public class City {
	private int id=-1;//城市id
	private String name;//城市名称
	private String countryCode;//城市代号
	private String district;//区域
	private String population;//区号
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the countryCode
	 */
	public String getcountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setcountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}
	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	/**
	 * @return the population
	 */
	public String getPopulation() {
		return population;
	}
	/**
	 * @param population the population to set
	 */
	public void setPopulation(String population) {
		this.population = population;
	}


}
