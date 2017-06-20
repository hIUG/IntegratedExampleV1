package com.e.c.a.h.integratedexamplev1.data.mapper;

import com.e.c.a.h.integratedexamplev1.data.model.CharacterModel;
import com.e.c.a.h.integratedexamplev1.data.source.remote.entity.CharacterResult;
import com.e.c.a.h.integratedexamplev1.util.Constants;

/**
 * Created by hugoa on 5/12/2017.
 */

public class Mapper {
    public static CharacterModel mapCharacterResponseToCharacterModel(CharacterResult characterResult) {
        CharacterModel character = new CharacterModel();

        character.setName(characterResult.getData().getResults().get(0).getName());
        character.setDescription(characterResult.getData().getResults().get(0).getDescription());
        character.setThumbnail(String.format("%s/%s.%s",
                characterResult.getData().getResults().get(0).getThumbnail().getPath(),
                Constants.STANDARD_XLARGE,
                characterResult.getData().getResults().get(0).getThumbnail().getExtension()));
        character.setImage(String.format("%s/%s.%s",
                characterResult.getData().getResults().get(0).getThumbnail().getPath(),
                Constants.PORTRAIT_XLARGE,
                characterResult.getData().getResults().get(0).getThumbnail().getExtension()));

        return character;
    }
}
