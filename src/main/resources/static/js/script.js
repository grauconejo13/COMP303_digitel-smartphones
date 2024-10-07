    const phoneModels = {
        "iPhone": [
            { value: "iPhone XR", text: "iPhone XR" },
            { value: "iPhone 11 Pro", text: "iPhone 11 Pro" },
            { value: "iPhone 12", text: "iPhone 12" },
            { value: "iPhone 14 Pro Max", text: "iPhone 14 Pro Max" }
        ],
        "Samsung": [
            { value: "Samsung Galaxy 20 Plus", text: "Samsung Galaxy 20 Plus" },
            { value: "Samsung Galaxy S20", text: "Samsung Galaxy S20" },
            { value: "Samsung Galaxy Note 10 Plus", text: "Samsung Galaxy Note 10 Plus" },
            { value: "Samsung Galaxy Z Flip 5", text: "Samsung Galaxy Z Flip 5" }
        ],
        "Google": [
            { value: "Google Pixel 5", text: "Google Pixel 5" },
            { value: "Google Pixel 6", text: "Google Pixel 6" },
            { value: "Google Pixel 6 Pro", text: "Google Pixel 6 Pro" },
            { value: "Google Pixel 7", text: "Google Pixel 7" }
        ],
        "Blackberry": [
            { value: "Blackberry Key2", text: "Blackberry Key2" },
            { value: "Blackberry Motion", text: "Blackberry Motion" },
            { value: "Blackberry Classic", text: "Blackberry Classic" }
        ]
    };

    // Function to update the phone models dropdown based on the selected brand
    function updateModels() {
        const brandSelect = document.getElementById('brand');
        const modelSelect = document.getElementById('model');
        const selectedBrand = brandSelect.value;

        console.log("Selected brand:", selectedBrand);  // Debugging selected brand
        modelSelect.innerHTML = '<option value="">Select a model</option>';

        // Populate the model dropdown with the corresponding models
        if (selectedBrand && phoneModels[selectedBrand]) {
            console.log("Phone models for selected brand:", phoneModels[selectedBrand]);  // Debugging phone models
            phoneModels[selectedBrand].forEach(function(model) {
                const option = document.createElement('option');
                option.value = model.value;
                option.text = model.text;
                modelSelect.appendChild(option);
            });
        }
    }

    // Attach the event listener once the DOM is fully loaded
    document.addEventListener('DOMContentLoaded', function() {
        const brandSelect = document.getElementById('brand');
        brandSelect.addEventListener('change', updateModels);
    });
