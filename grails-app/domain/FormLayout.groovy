public class FormLayout {

    Long id
    String key;
    String column;
    String displayName;
    String dataType;
    Integer sequence;
    Boolean display = true;

    /*static mapping = {
        table 'CZ_FORM_LAYOUT'
        id generator: 'sequence', params: [sequence: 'SEQ_CZ_FORM_LAYOUT_ID']
        version false
        id column: 'FORM_LAYOUT_ID'
        key column: 'FORM_KEY'
        column column: 'FORM_COLUMN'
        displayName column: 'DISPLAY_NAME'
        dataType column: 'DATA_TYPE'
        sequence column: 'SEQUENCE'
    }*/

    static mapping = {
        datasource 'tmcz'
        table 'cz_form_layout'
        //id generator: 'sequence', params: [sequence: 'seq_cz_form_layout_id']
        id generator: 'sequence', params: [sequence: 'seq_form_layout_id']
        version false
        id column: 'form_layout_id'
        key column: 'form_key'
        column column: 'form_column'
        displayName column: 'display_name'
        dataType column: 'data_type'
        sequence column: 'sequence'
    }

    static constraints = {
        key(nullable: false)
        column(nullable: false)
        displayName(nullable: true)
        dataType(nullable: true)
        sequence(nullable: true)
    }

}
