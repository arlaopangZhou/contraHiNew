package com.player.boxplayer.util;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.player.boxplayer.tile.Tile;
import com.player.boxplayer.tile.TileGroup;

public class TileXmlHandler extends DefaultHandler {
	private List<TileGroup> tgs;
	private TileGroup tg;

	private final String CATE = "cate";
	private final String TILE = "tile";
	private final String IMG = "image";
	private final String NAME = "name";
	private final String INTENT = "intent";

	public void setDir(String dir) {
	}

	public List<TileGroup> getTileGroups() {
		return this.tgs;
	}

	@Override
	public void startDocument() throws SAXException {
		super.startDocument();
		tgs = new ArrayList<TileGroup>();
	}

	@Override
	public void startElement(String uri, String localName, String name,
			Attributes attributes) throws SAXException {
		super.startElement(uri, localName, name, attributes);
		if (localName.equalsIgnoreCase(CATE)) {
			tg = new TileGroup();
			tg.setTitle(attributes.getValue(NAME));
			tgs.add(tg);
		} else if (localName.equalsIgnoreCase(TILE)) {
			Tile tile = new Tile();
			tile.setTitle(attributes.getValue(NAME));
			tile.setImageUrl(attributes.getValue(IMG));
			tile.setIntent(attributes.getValue(INTENT));
			tg.addTile(tile);
		}
	}
}
