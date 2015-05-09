package uk.jamierocks.lexteam.ygd.core.test;

import org.junit.Assert;
import org.junit.Test;
import uk.jamierocks.lexteam.ygd.core.level.LevelBuilder;
import uk.jamierocks.lexteam.ygd.core.section.Section;
import uk.jamierocks.lexteam.ygd.core.section.SectionBuilder;

/**
 * Created /me
 */
public class MainTest {
    @Test
    public void MainTest(){
        LevelBuilder levelBuilder = new LevelBuilder();
        SectionBuilder sectionBuilder = new SectionBuilder();
        sectionBuilder.addLevel(levelBuilder.build());
        sectionBuilder.addLevel(levelBuilder.build());
    }
}
