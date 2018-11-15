package labeight.experiment;

import labeight.data.ResultsTable;
import labeight.list.SinglyLinkedList;

/**
 * An Experiment class that can run a campaign of experiments.
 * Note that this class supports running campaigns of experiments for a
 * different number of rounds for different methods of SinglyLinkedList.
 *
 * @author Gregory M. Kapfhammer
 */

public class Experiment {

  /** The length of the campaign for the textual representation construction. */
  private static final int TOSTRING_CAMPAIGN = 20;

  /** Run the toString experiment. */
  public static void runToStringExperiment() {
    RunCampaign runComputationCampaign = new RunCampaign();
    SinglyLinkedList<String> list = new SinglyLinkedList<String>();
    ResultsTable toStringResultsTable =
        runComputationCampaign.run(list, TOSTRING_CAMPAIGN);
    // TODO: Add the source code to produce the summary output
  }

  /** Run the experiment campaigns for an algorithm in a SinglyLinkedList. */
  public static void main(String[] args) {
    // TODO: Call the method that will run the experiment for the toString method
  }

}
