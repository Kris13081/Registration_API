import React, { useState } from "react";
import years from "./Years";
import months from "./Months";


function DateInputs() {
    const [selectedMonth, setSelectedMonth] = useState("");
    const [selectedDay, setSelectedDay] = useState("");

    const handleMonthChange = (e) => {
        const monthName = e.target.value;
        setSelectedMonth(monthName);
        setSelectedDay("");
    };

    return (
            <div className="birth-date-wrapper">
                <span>Birth Date:</span>
                <div className="years-wrapper">
	            <select name="years">
					{years.map((years, index) => (
						<option key={index} value={years}>{years}</option>
					))};
				    </select>
                </div>  
                <select name="month" onChange={handleMonthChange} value={selectedMonth}>
                    {months.map((month) => (
                        <option key={month.name} value={month.name}>
                            {month.name}
                        </option>
                    ))}
                </select>
                {selectedMonth && (
                    <select name="day" value={selectedDay} onChange={(e) => setSelectedDay(e.target.value)}>
                        {Array.from({ length: months.find((m) => m.name === selectedMonth).days }).map((_, index) => (
                            <option key={index + 1} value={index + 1}>
                                {index + 1}
                            </option>
                        ))}
                    </select>
                )}
            </div>
    );
}

export default DateInputs;
