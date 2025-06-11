Feature: Radio button interaction

  Scenario: Select Yes radio button
    Given Going To Page "https://demoqa.com/radio-button"
    When Wait And Select Radio Button Yes
    Then Verify Radio Button Yes Selected
    
// Scenario outline: 
