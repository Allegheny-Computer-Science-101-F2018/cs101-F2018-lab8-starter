package labeight.experiment;

import labeight.data.ResultsTable;
import labeight.list.SinglyLinkedList;

import java.util.Random;

/**
 * A RunCampaign class that can run an experiment with a computer.
 *
 * @author Gregory M. Kapfhammer
 */

public class RunCampaign implements Campaign {

  /** The starting size for running an experiment campaign. */
  private static final int INPUT_SIZE_START = 10;

  /** The growth factor for input when running an experiment campaign. */
  private static final int INPUT_GROWTH_FACTOR = 2;

  /** The indentation level for the output. */
  private static final String IDENTATION = "  ";

  /** Run a provided ArithmeticComputation in an experiment campaign for specified rounds. */
  public ResultsTable run(SinglyLinkedList<String> list, int campaignLength) {
    int campaignRound = 0;
    int currentInputSize = INPUT_SIZE_START;
    // TODO: Correctly declare an operation variable with the correct value for a label
    String operation = null;
    System.out.println("Starting a campaign of experiments with " + operation + " ...");
    ResultsTable results = new ResultsTable(campaignLength);
    while (campaignRound < campaignLength) {
      // TODO: populate the SinglyLinkedList with the data
      // TODO: run the experiment on the toString method
      // TODO: store the result and produce the debugging information
      // TODO: increase the size and go to the next campaignRound
    }
    System.out.println("... Finishing a campaign of experiments with " + operation);
    return results;
  }

  /** Populate the SinglyLinkedList with the specified amount of data. */
  public void populateList(SinglyLinkedList<String> list, int requestedSize) {
    // TODO: Use a loop to fill a SinglyLinkedList with requestedSize elements
  }

}
