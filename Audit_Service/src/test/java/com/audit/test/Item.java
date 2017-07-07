package com.audit.test;

public class Item {

	private String id;

	private String name;

	private String mfgYear;

	public Item(String id, String name, String mfgYear) {
		this.id = id;
		this.name = name;
		this.mfgYear = mfgYear;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the model
	 */
	public String getMfgYear() {
		return mfgYear;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setMfgYear(String mfgYear) {
		this.mfgYear = mfgYear;
	}

}
