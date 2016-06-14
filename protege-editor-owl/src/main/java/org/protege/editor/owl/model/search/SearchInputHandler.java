package org.protege.editor.owl.model.search;

/**
 * @author Josef Hardi <johardi@stanford.edu> <br>
 * Stanford Center for Biomedical Informatics Research
 */
public interface SearchInputHandler {

    void handle(SearchKeyword searchKeyword);

    void handle(CompoundKeyword compoundKeyword);
}
