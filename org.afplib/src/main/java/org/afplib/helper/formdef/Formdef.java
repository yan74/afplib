package org.afplib.helper.formdef;

import java.io.IOException;

import org.afplib.base.SF;
import org.afplib.io.AfpOutputStream;

/**
 * Formdef is basically a collection of medium maps. Supports finding
 * by various keys and adding (creating) new medium maps.
 *
 */
public interface Formdef {

	public MediumMap findByName(String mmname);

	public MediumMap findFirstByBin(int bin);

	public MediumMap findFirstByBin(int bin, Plex plex);

	public MediumMap findFirstByMediaName(String media);

	public MediumMap findFirstByMediaName(String media, Plex plex);

	public MediumMap findByHash(int hash);

	public MediumMap findEqual(MediumMap map);
	
	public MediumMap[] mediumMaps();

	public void add(SF[] mediumMap);

	public void add(String newMMName, SF[] mediumMap);

	public void setBDG(SF[] bdg);
	
	/**
	 * writes the formdef to the output stream, possibly encapsulating
	 * it in a BRS/ERS envelope. In this case the name of the resource
	 * will be F1INLINE.
	 * 
	 * @param out afp file or formdef to write to.
	 * @param asResource weather to wrap it into BRS/ERS
	 * @throws IOException 
	 */
	public void save(AfpOutputStream out, boolean asResource) throws IOException;

}
