const phoneModels = {
    "iPhone": [
        { value: "iPhone XR", text: "iPhone XR" },
        { value: "iPhone 11 Pro", text: "iPhone 11 Pro" }
    ],
    "Samsung": [
        { value: "Samsung Galaxy 20 Plus", text: "Samsung Galaxy 20 Plus" },
        { value: "Samsung Galaxy S20", text: "Samsung Galaxy S20" }
    ],
    "Google": [
        { value: "Google Pixel 5", text: "Google Pixel 5" },
        { value: "Google Pixel 6", text: "Google Pixel 6" }
    ],
    "Blackberry": [
        { value: "Blackberry Key2", text: "Blackberry Key2" },
        { value: "Blackberry Motion", text: "Blackberry Motion" }
    ]
};

function updateModels() {
    "use strict";
    const brandSelect = document.getElementById('brand');
    const modelSelect = document.getElementById('model');
    const selectedBrand = brandSelect.value;


 console.log("Selected brand:", selectedBrand);  // Check if the brand is being selected correctly

    // Clear the existing model options
    modelSelect.innerHTML = '<option value="">Select a model</option>';

    if (selectedBrand) {
		
		 console.log("Phone models for selected brand:", phoneModels[selectedBrand]);  // Check the models for that brand
        // Populate the model dropdown with the selected brand's models
        phoneModels[selectedBrand].forEach(function(model) {
            const option = document.createElement('option');
            option.value = model.value;
            option.text = model.text;
            modelSelect.appendChild(option);
        });
    }

    // Add an event listener to call `updateModels` when the brand changes
    document.addEventListener('DOMContentLoaded', function() {
        const brandSelect = document.getElementById('brand');
        brandSelect.addEventListener('change', updateModels);
    });
}