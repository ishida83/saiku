package org.saiku.olap.query2;

import org.apache.commons.lang.StringUtils;
import org.saiku.olap.dto.SaikuCube;

public class ThinQuery {
	
	private ThinQueryModel queryModel;
	private SaikuCube cube;
	private String mdx;
	private String name;
	
	private enum Type {
		MDX,
		QUERYMODEL
	}
	
	private Type type;
	
	public ThinQuery() {};
	
	public ThinQuery(String name, SaikuCube cube, ThinQueryModel queryModel) {
		super();
		this.queryModel = queryModel;
		this.type = Type.QUERYMODEL;
		this.cube = cube;
		this.name = name;
	}

	public ThinQuery(String name, SaikuCube cube, String mdx) {
		super();
		this.mdx = mdx;
		this.type = Type.MDX;
		this.cube = cube;
		this.name = name;
	}

	
	/**
	 * @return the queryModel
	 */
	public ThinQueryModel getQueryModel() {
		return queryModel;
	}

	/**
	 * @param queryModel the queryModel to set
	 */
	public void setQueryModel(ThinQueryModel queryModel) {
		this.queryModel = queryModel;
		if (queryModel != null) {
			this.type = Type.QUERYMODEL;
		}
	}

	/**
	 * @return the cube
	 */
	public SaikuCube getCube() {
		return cube;
	}

	/**
	 * @param cube the cube to set
	 */
	public void setCube(SaikuCube cube) {
		this.cube = cube;
	}

	/**
	 * @return the mdx
	 */
	public String getMdx() {
		return mdx;
	}

	/**
	 * @param mdx the mdx to set
	 */
	public void setMdx(String mdx) {
		this.mdx = mdx;
		if (StringUtils.isNotBlank(mdx)) {
			this.type = Type.MDX;
		}
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
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}
}
