package ru.filippovle.realestatebooking.specification;

import jakarta.persistence.criteria.Root;
import jakarta.persistence.criteria.Subquery;
import org.springframework.data.jpa.domain.Specification;
import ru.filippovle.realestatebooking.model.entity.Booking;
import ru.filippovle.realestatebooking.model.entity.Lot;

import java.util.Optional;

public class LotSpecifications {

    public static Specification<Lot> titleContains(String title) {
        return (root, query, criteriaBuilder) ->
                Optional.ofNullable(title)
                        .map(t -> criteriaBuilder.like(root.get("title"), "%" + t + "%"))
                        .orElse(null);
    }

    public static Specification<Lot> cityEquals(String city) {
        return (root, query, criteriaBuilder) ->
                Optional.ofNullable(city)
                        .map(c -> criteriaBuilder.equal(root.get("city"), c))
                        .orElse(null);
    }

    public static Specification<Lot> addressContains(String address) {
        return (root, query, criteriaBuilder) ->
                Optional.ofNullable(address)
                        .map(a -> criteriaBuilder.like(root.get("address"), "%" + a + "%"))
                        .orElse(null);
    }

    public static Specification<Lot> areaBetween(Double minArea, Double maxArea) {
        return (root, query, criteriaBuilder) -> {
            if (minArea == null && maxArea == null) {
                return null;
            } else if (minArea == null) {
                return criteriaBuilder.lessThanOrEqualTo(root.get("area"), maxArea);
            } else if (maxArea == null) {
                return criteriaBuilder.greaterThanOrEqualTo(root.get("area"), minArea);
            } else {
                return criteriaBuilder.between(root.get("area"), minArea, maxArea);
            }
        };
    }

    public static Specification<Lot> floorBetween(Integer minFloor, Integer maxFloor) {
        return (root, query, criteriaBuilder) -> {
            if (minFloor == null && maxFloor == null) {
                return null;
            } else if (minFloor == null) {
                return criteriaBuilder.lessThanOrEqualTo(root.get("floor"), maxFloor);
            } else if (maxFloor == null) {
                return criteriaBuilder.greaterThanOrEqualTo(root.get("floor"), minFloor);
            } else {
                return criteriaBuilder.between(root.get("floor"), minFloor, maxFloor);
            }
        };
    }

    public static Specification<Lot> roomsBetween(Integer minRooms, Integer maxRooms) {
        return (root, query, criteriaBuilder) -> {
            if (minRooms == null && maxRooms == null) {
                return null;
            } else if (minRooms == null) {
                return criteriaBuilder.lessThanOrEqualTo(root.get("rooms"), maxRooms);
            } else if (maxRooms == null) {
                return criteriaBuilder.greaterThanOrEqualTo(root.get("rooms"), minRooms);
            } else {
                return criteriaBuilder.between(root.get("rooms"), minRooms, maxRooms);
            }
        };
    }
    public static Specification<Lot> isNotBooked() {
        return (root, query, criteriaBuilder) -> {
            query.distinct(true);
            Subquery<Long> subquery = query.subquery(Long.class);
            Root<Booking> subRoot = subquery.from(Booking.class);
            subquery.select(subRoot.get("lotId"));
            subquery.where(criteriaBuilder.equal(subRoot.get("lotId"), root.get("id")));
            return criteriaBuilder.not(criteriaBuilder.exists(subquery));
        };
    }
}