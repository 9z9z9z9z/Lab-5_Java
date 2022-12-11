import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class Dataset
{
    public static CategoryDataset createDatasetArraylistMed() {
        DefaultCategoryDataset dataset;
        String categorie_10 = "10";
        String categorie_100 = "100";
        String categorie_1000 = "1000";
        String categorie_10000 = "10000";
        String categorie_100000 = "100000";

        int data_al_rem_10 = 5900;
        int data_al_rem_100 = 4960;
        int data_al_rem_1000 = 4041;
        int data_al_rem_10000 = 3553;
        int data_al_rem_100000 = 7359;

        int data_al_add_10 = 68114;
        int data_al_add_100 = 6638;
        int data_al_add_1000 = 488;
        int data_al_add_10000 = 355;
        int data_al_add_100000 = 735;

        // row keys...
        final String series_remove_arraylist = "Medium remove time to ArrayList";
        final String series_add_arraylist = "Medium add time to ArrayList";

        dataset = new DefaultCategoryDataset();

        dataset.addValue(data_al_rem_10, series_remove_arraylist, categorie_10);
        dataset.addValue(data_al_rem_100, series_remove_arraylist, categorie_100);
        dataset.addValue(data_al_rem_1000, series_remove_arraylist, categorie_1000);
        dataset.addValue(data_al_rem_10000, series_remove_arraylist, categorie_10000);
        dataset.addValue(data_al_rem_100000, series_remove_arraylist, categorie_100000);

        dataset.addValue(data_al_add_10, series_add_arraylist, categorie_10);
        dataset.addValue(data_al_add_100, series_add_arraylist, categorie_100);
        dataset.addValue(data_al_add_1000, series_add_arraylist, categorie_1000);
        dataset.addValue(data_al_add_10000, series_add_arraylist, categorie_10000);
        dataset.addValue(data_al_add_100000, series_add_arraylist, categorie_100000);

        return dataset;
    }
    public static CategoryDataset createDatasetArraylistSum() {
        DefaultCategoryDataset dataset;
        String categorie_10 = "10";
        String categorie_100 = "100";
        String categorie_1000 = "1000";
        String categorie_10000 = "10000";
        String categorie_100000 = "100000";

        int data_al_rem_ob_10 = 5900;
        int data_al_rem_ob_100 = 49600;
        int data_al_rem_ob_1000 = 404100;
        int data_al_rem_ob_10000 = 3553100;
        int data_al_rem_ob_100000 = 73596300;

        int data_al_add_ob_10 = 681140;
        int data_al_add_ob_100 = 663840;
        int data_al_add_ob_1000 = 488090;
        int data_al_add_ob_10000 = 613800;
        int data_al_add_ob_100000 = 1018260;

        final String series_sum_remove_arraylist = "Sum remove time to ArrayList";
        final String series_sum_add_arraylist = "Sum add time to ArrayList";

        dataset = new DefaultCategoryDataset();

        dataset.addValue(data_al_rem_ob_10, series_sum_remove_arraylist, categorie_10);
        dataset.addValue(data_al_rem_ob_100, series_sum_remove_arraylist, categorie_100);
        dataset.addValue(data_al_rem_ob_1000, series_sum_remove_arraylist, categorie_1000);
        dataset.addValue(data_al_rem_ob_10000, series_sum_remove_arraylist, categorie_10000);
        dataset.addValue(data_al_rem_ob_100000, series_sum_remove_arraylist, categorie_100000);

        dataset.addValue(data_al_add_ob_10, series_sum_add_arraylist, categorie_10);
        dataset.addValue(data_al_add_ob_100, series_sum_add_arraylist, categorie_100);
        dataset.addValue(data_al_add_ob_1000, series_sum_add_arraylist, categorie_1000);
        dataset.addValue(data_al_add_ob_10000, series_sum_add_arraylist, categorie_10000);
        dataset.addValue(data_al_add_ob_100000, series_sum_add_arraylist, categorie_100000);

        return dataset;
    }

    public static CategoryDataset createDatasetHashmapMed() {
        DefaultCategoryDataset dataset;

        String categorie_10 = "10";
        String categorie_100 = "100";
        String categorie_1000 = "1000";
        String categorie_10000 = "10000";
        String categorie_100000 = "100000";

        int data_hm_remove_med_10 = 8900;
        int data_hm_remove_med_100 = 2020;
        int data_hm_remove_med_1000 = 2150;
        int data_hm_remove_med_10000 = 901;
        int data_hm_remove_med_100000 = 687;

        int data_hm_add_med_10 = 79700;
        int data_hm_add_med_100 = 7480;
        int data_hm_add_med_1000 = 7369;
        int data_hm_add_med_10000 = 1026;
        int data_hm_add_med_100000 = 501;

        // row keys...
        final String series_remove_hashmap = "Medium remove time to HashMap";
        final String series_add_hashmap = "Medium add time to HashMap";

        dataset = new DefaultCategoryDataset();

        dataset.addValue(data_hm_remove_med_10, series_remove_hashmap, categorie_10);
        dataset.addValue(data_hm_remove_med_100, series_remove_hashmap, categorie_100);
        dataset.addValue(data_hm_remove_med_1000, series_remove_hashmap, categorie_1000);
        dataset.addValue(data_hm_remove_med_10000, series_remove_hashmap, categorie_10000);
        dataset.addValue(data_hm_remove_med_100000, series_remove_hashmap, categorie_100000);

        dataset.addValue(data_hm_add_med_10, series_add_hashmap, categorie_10);
        dataset.addValue(data_hm_add_med_100, series_add_hashmap, categorie_100);
        dataset.addValue(data_hm_add_med_1000, series_add_hashmap, categorie_1000);
        dataset.addValue(data_hm_add_med_10000, series_add_hashmap, categorie_10000);
        dataset.addValue(data_hm_add_med_100000, series_add_hashmap, categorie_100000);

        return dataset;
    }
    public static CategoryDataset createDatasetHashmapSum() {
        DefaultCategoryDataset dataset;

        String categorie_10 = "10";
        String categorie_100 = "100";
        String categorie_1000 = "1000";
        String categorie_10000 = "10000";
        String categorie_100000 = "100000";

        int data_hm_rem_sum_10 = 8900;
        int data_hm_rem_sum_100 = 20200;
        int data_hm_rem_sum_1000 = 215000;
        int data_hm_rem_sum_10000 = 900900;
        int data_hm_rem_sum_100000 = 6865200;

        int data_hm_add_sum_10 = 797000;
        int data_hm_add_sum_100 = 748090;
        int data_hm_add_sum_1000 = 736970;
        int data_hm_add_sum_10000 = 1026050;
        int data_hm_add_sum_100000 = 5010350;
        // row keys...
        final String series_remove_hashmap = "Sum remove time to HashMap";
        final String series_add_hashmap = "Sum add time to HashMap";

        dataset = new DefaultCategoryDataset();

        dataset.addValue(data_hm_rem_sum_10, series_add_hashmap, categorie_10);
        dataset.addValue(data_hm_rem_sum_100, series_add_hashmap, categorie_100);
        dataset.addValue(data_hm_rem_sum_1000, series_add_hashmap, categorie_1000);
        dataset.addValue(data_hm_rem_sum_10000, series_add_hashmap, categorie_10000);
        dataset.addValue(data_hm_rem_sum_100000, series_add_hashmap, categorie_100000);

        dataset.addValue(data_hm_add_sum_10, series_remove_hashmap, categorie_10);
        dataset.addValue(data_hm_add_sum_100, series_remove_hashmap, categorie_100);
        dataset.addValue(data_hm_add_sum_1000, series_remove_hashmap, categorie_1000);
        dataset.addValue(data_hm_add_sum_10000, series_remove_hashmap, categorie_10000);
        dataset.addValue(data_hm_add_sum_100000, series_remove_hashmap, categorie_100000);

        return dataset;
    }
}
