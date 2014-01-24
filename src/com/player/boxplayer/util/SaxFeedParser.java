package com.player.boxplayer.util;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.player.boxplayer.tile.TileGroup;

public class SaxFeedParser {
	final InputStream is;
	
	public SaxFeedParser(FileInputStream is) {
		this.is = is;
	}
	
	public List<TileGroup> parse() {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			SAXParser parser = factory.newSAXParser();
			TileXmlHandler handler = new TileXmlHandler();
			parser.parse(is, handler);
			return handler.getTileGroups();//
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
