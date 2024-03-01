function checkAge(age) {
    if(age >= 18) {
        console.log("You can vote");
    } else {
        console.log("You cannot vote");
    }
}

checkAge(16);

function checkDayOfWeek(dayNumber) {
    let day;

    switch (dayNumber) {
        case 0:
            day = "Monday"
            break;
        case 1:
            day = "Tuesday"
            break;
        default:
            console.log("Invalid day");
            break;
    }
    return day;
}
console.log(checkDayOfWeek(1));