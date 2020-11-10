-- We do not need to truncate all tables to empty all tables thanks to 'CASCADE'.

TRUNCATE taxon CASCADE;

TRUNCATE location CASCADE;

TRUNCATE publication CASCADE;

TRUNCATE project CASCADE;

TRUNCATE biosamplePackage CASCADE;

TRUNCATE experiment CASCADE;

TRUNCATE recommendation CASCADE;