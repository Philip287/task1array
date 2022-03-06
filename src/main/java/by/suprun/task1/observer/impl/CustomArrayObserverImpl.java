package by.suprun.task1.observer.impl;


import by.suprun.task1.entity.CustomArray;
import by.suprun.task1.entity.CustomArrayParameters;
import by.suprun.task1.entity.Warehouse;
import by.suprun.task1.exception.CustomArrayException;
import by.suprun.task1.observer.CustomArrayObserver;
import by.suprun.task1.service.impl.CustomArrayCalculateImpl;
import by.suprun.task1.service.impl.CustomArrayFindImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class CustomArrayObserverImpl implements CustomArrayObserver {
    private static final Logger logger = LogManager.getLogger();

    public void replaceStatistic(CustomArrayEvent event) {
        try {
            CustomArray source = event.getSource();
            int sourceId = source.getId();
            Warehouse warehouse = Warehouse.getInstance();
            warehouse.clearValue(sourceId);
        } catch (CustomArrayException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void updateMin(CustomArrayEvent event) {
        try {
            CustomArray source = event.getSource();
            int sourceId = source.getId();
            Warehouse warehouse = Warehouse.getInstance();
            CustomArrayParameters statistics = warehouse.getById(sourceId);
            CustomArrayFindImpl customArrayFind = CustomArrayFindImpl.getInstance();
            OptionalInt min = customArrayFind.arrayMin(source);
            if (min.isPresent()) {
                statistics.setMin(min.getAsInt());
            }
        } catch (CustomArrayException e) {
            logger.error(e.getMessage());
        }
    }

    @Override
    public void updateMax(CustomArrayEvent event) {
        try {
            CustomArray source = event.getSource();
            int sourceId = source.getId();
            Warehouse warehouse = Warehouse.getInstance();
            CustomArrayParameters statistics = warehouse.getById(sourceId);
            CustomArrayFindImpl customArrayFind = CustomArrayFindImpl.getInstance();
            OptionalInt max = customArrayFind.arrayMax(source);
            if (max.isPresent()) {
                statistics.setMax(max.getAsInt());
            }
        } catch (CustomArrayException e) {
            logger.error(e.getMessage());
        }
    }

    @Override
    public void updateAvg(CustomArrayEvent event) {
        try {
            CustomArray source = event.getSource();
            int sourceId = source.getId();
            Warehouse warehouse = Warehouse.getInstance();
            CustomArrayParameters statistics = warehouse.getById(sourceId);
            CustomArrayCalculateImpl calculate = CustomArrayCalculateImpl.getInstance();
            OptionalDouble avg = calculate.averageOfArray(source);
            if (avg.isPresent()) {
                statistics.setAvg(avg.getAsDouble());
            }
        } catch (CustomArrayException e) {
            logger.error(e.getMessage());
        }
    }

    @Override
    public void updateSum(CustomArrayEvent event) {
        try {
            CustomArray source = event.getSource();
            int sourceId = source.getId();
            Warehouse warehouse = Warehouse.getInstance();
            CustomArrayParameters statistics = warehouse.getById(sourceId);
            CustomArrayCalculateImpl calculate = CustomArrayCalculateImpl.getInstance();
            statistics.setSum((calculate.sumElementsOfArray(source)).getAsDouble());
        } catch (CustomArrayException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
    }
}
