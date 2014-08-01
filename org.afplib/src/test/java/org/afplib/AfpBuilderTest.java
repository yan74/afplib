package org.afplib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.BAG;
import org.afplib.afplib.Comment;
import org.afplib.afplib.NOP;
import org.junit.Test;

public class AfpBuilderTest {

	@Test public void testCreate() {
		BAG bag = new AfpBuilder().create(BAG.class);
		assertNotNull(bag);
	}

	@Test public void testCreateWithProperty() {
		BAG bag = new AfpBuilder()
			.with(AfplibPackage.BAG__AEG_NAME, "BAGTEST0")
			.withMember(new AfpBuilder()
				.with(AfplibPackage.COMMENT__COMMENT, "Mein Kommentar")
				.create(Comment.class))
			.withMember(new AfpBuilder()
				.create(NOP.class))
			.create(BAG.class);
		
		assertNotNull(bag);
		assertEquals("BAGTEST0", bag.getAEGName());
		assertTrue(bag.getTriplets().get(0) instanceof Comment);
		assertEquals("Mein Kommentar", ((Comment)bag.getTriplets().get(0)).getComment());
		assertTrue(bag.getChildren().get(0) instanceof NOP);
	}

}
