export class Education {
    id?: number;
    nameEducation: string;
    titleEducation: string;
    yearEducation: string;
    countryEducation: string;
    descriptionEducation: string;

    constructor(nameEducation: string, titleEducation: string, yearEducation: string, countryEducation: string, descriptionEducation: string) {
        this.nameEducation = nameEducation;
        this.titleEducation = titleEducation;
        this.yearEducation = yearEducation;
        this.countryEducation = countryEducation;
        this.descriptionEducation = descriptionEducation;
    }
}