export class Experience {
    id?: number;
    nameExperience: string;
    titleExperience: string;
    yearExperience: string;
    countryExperience: string;
    descriptionExperience: string;

    constructor(nameExperience: string, titleExperience: string, yearExperience: string, countryExperience: string, descriptionExperience: string) {
        this.nameExperience = nameExperience;
        this.titleExperience = titleExperience;
        this.yearExperience = yearExperience;
        this.countryExperience = countryExperience;
        this.descriptionExperience = descriptionExperience;
    }
}