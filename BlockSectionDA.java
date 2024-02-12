import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BlockSectionDA {

    public BlockSectionDA() throws FileNotFoundException {
        //read blockSectionInfo
        Scanner blockSectionInfo = new Scanner(
                new FileReader("blockSection.csv"));

        String rowBlockSection = new String();

        rowBlockSection =  blockSectionInfo.nextLine();

        String[] rowblockSectionSpecific = new String[4];

        rowblockSectionSpecific = rowBlockSection.split(",");

        BlockSection blockSection= new BlockSection();

        blockSection.setBlockCode(rowblockSectionSpecific[0].trim());
        blockSection.setDescription(rowblockSectionSpecific[1].trim());
        blockSection.setAdviser(rowblockSectionSpecific[2].trim());
        blockSection.setTotalStudents(Integer.parseInt(rowblockSectionSpecific[3].trim()));


        StudentDA studentDA = new StudentDA();

         blockSection.setStudentList(studentDA.getStudentList());

         System.out.println(blockSection);




        blockSectionInfo.close();
            }

    public static BlockSection[] getBlockSectionList() {
    
        throw new UnsupportedOperationException("Unimplemented method 'getBlockSectionList'");
    }

        }
