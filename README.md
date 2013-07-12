Mapping and Configuration are very familiar keywords we used to hear in the hibernate, every hibernate program must need these 2 xml files.
Mapping:
Mapping file is the heart of hibernate application.
Every ORM tool needs this mapping, mapping is the mechanism of placing an object properties into column’s of a table.
Mapping can be given to an ORM tool either in the form of an XML or in the form of the annotations.
The mapping file contains mapping from a pojo class name to a table name and pojo class variable names to table column names.
While writing an hibernate application, we can construct one or more mapping files, mean a hibernate application can contain any number of mapping files.

Syntax for Mapping xml:

<hibernate-mapping>

    <class name="POJO class name" table="table name in database">
        <id name="variable name" column="column name in database" type="java/hibernate type" />
        <property name="variable1 name" column="column name in database"
            type="java/hibernate type" />
        <property name="variable2 name" column="column name in database"
            type="java/hibernate type" />
    </class>
</hibernate-mapping>
Hibernate Mapping File:

Its a xml file.
Any file name *.xml can become hibernate mapping file.
Naming standard is <Pojo-class-name>.hbm.xml [hbm indicates hibernate mapping file].
DTD [Document Type Definition]: In beginning of this file we need to specify DTD.
It is used to validate xml file while parsing the xml file.
Its compulsory to specify DTD
Note: DTD file of configuration file and mapping file are different.
One hibernate application can have multiple mapping files.
All mapping file names must be specified in hibernate configuration file.
We can have a separate mapping file for every pojo class or we can give mappings for multiple pojo classes in a single mapping file.
Hibernate mapping file contains OR mapping configuration like class to table mapping,member variables to columns mapping and relationships etc.., 
Note:We will discuss below topics later with examples:

Hibernate allows the following OR mapping(Object relational mapping) file operations in mapping file:

1. Basic OR mapping [table – pojo class, table columns – pojo class properties..]
2. Inheritance mapping [<subclass>, <joined-subclass>,<union-subclass>…]
3. collection mapping [<set> <list> <map> <bag> <idbag>]
4. association mapping [<one-to-one>, <one-to-many>, <many-to-many>…]
5. component mapping [<component> to declare another class object as a property of our pojo class] 
