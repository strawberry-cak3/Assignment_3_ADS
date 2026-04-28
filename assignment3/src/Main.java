public class Main {
    public static void main(String[] args) {
        Experiment experiment = new Experiment();

        System.out.println("Running Experiments...");

        // Small
        experiment.runAllExperiments(10);

        // Medium
        experiment.runAllExperiments(100);

        // Large
        experiment.runAllExperiments(1000);
    }
}
