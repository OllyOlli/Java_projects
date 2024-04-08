package cz.robodreams.javadeveloper.homeworks.hw21junits;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class UserChannelImpl implements UserChannel {
    private final String userName;
    private final String itemName;
    private final String itemType;

    @Override
    public void onItemBorrowed(User user, Item item) {
        // implementace reakce na půjčení položky uživatelem
    }

    @Override
    public void onItemReturned(User user, Item item) {
        // implementace reakce na vrácení položky uživatelem
    }

    @Override
    public void onItemReserved(User user, Item item) {
        // implementace reakce na rezervaci položky uživatelem
    }
}

