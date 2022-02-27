package pw.kata;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelpYourGranny {

  public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {
    Map<String, String> friendTowns = Arrays.stream(ftwns)
            .collect(Collectors.toMap(x -> x[0], x -> x[1]));

    return Stream.concat(
                    Arrays.stream(arrFriends)
                            .map(name -> mapStage(name, friendTowns, h))
                            .filter(Optional::isPresent)
                            .map(Optional::get),
                    // add dummy stage with distance 0 to return home
                    Stream.of(new Stage(0.0, 0.0)))
            .reduce(new Stage(0.0, 0.0), (friend1, friend2) -> {
              Double distanceBetween = Math.sqrt(Math.abs(friend2.directDistanceToFriend() * friend2.directDistanceToFriend() - friend1.directDistanceToFriend() * friend1.directDistanceToFriend()));
              return new Stage(friend2.directDistanceToFriend(), friend1.currentTour() + distanceBetween);
            })
            .currentTour().intValue();
  }

  private static Optional<Stage> mapStage(String name, Map<String, String> friendTowns, Map<String, Double> h) {
    if (friendTowns.containsKey(name)) {
      return Optional.of(new Stage(h.get(friendTowns.get(name)), 0.0));
    }
    return Optional.empty();
  }

  record Stage(
          Double directDistanceToFriend,
          Double currentTour) {
  }
}
