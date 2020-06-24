CREATE TABLE sample (
    id varchar(10) NOT NULL,
    study varchar(10) NOT NULL,
    assay_type varchar(100) NOT NULL,
    center_name varchar(200) NOT NULL,
    instrument varchar(200) NOT NULL,
    library_layout varchar(50) NOT NULL,
    library_source varchar(50) NOT NULL,
    organism varchar(100) NOT NULL,
    platform varchar(50) NOT NULL,
    geo_loc_name varchar(200),
    collection_date varchar(50)
);