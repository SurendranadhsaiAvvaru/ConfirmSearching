Feature: Confirm Searching for various jobs should be possible as a registered user

@ConfirmSearch @All
Scenario: User should be able to view the detailed description of selected job
Given I visit the website as a registered user
When I click on Dashboard 
Then I will be redirected to the Dasboard page
And I should click on Applied Jobs
And I will be redirected to the Applied Jobs page 
Then I should click on the desired job

@ConfirmSearch @All
Scenario: User should be able to view the applied jobs
Given I visit the website as a registered user
When I click on Dashboard
Then I will be redirected to the Dasboard page
And I should click on Applied Jobs
And I will be redirected to the Applied Jobs page

@ConfirmSearch @All
Scenario: User should be able to view the saved jobs
Given I visit the website as a registered user
When I click on Dashboard
Then I will be redirected to the Dasboard page
And I should click on Saved Jobs
And I will be redirected to the Saved Jobs page

@ConfirmSearch @All
Scenario: User should be able to save the job
Given I visit the website as a registered user
When I click on Dashboard
Then I will be redirected to the Dasboard page
And I should click on Applied Jobs
And I will be redirected to the Applied Jobs page
Then I should click on the desired job
And I should click on the star icon to save

@ConfirmSearch @All
Scenario: User should be able to unsave the job
Given I visit the website as a registered user
When I click on Dashboard
Then I will be redirected to the Dasboard page
And I should click on Saved Jobs
And I will be redirected to the Saved Jobs page
Then I should click on the desired job
And I should click on the star icon to unsave

@ConfirmSearch @Ignore @All
Scenario: User should be able to apply for a job
Given I visit the website as a registered user
When I click on Dashboard
Then I will be redirected to the Dasboard page
And I should click on Saved Jobs
And I will be redirected to the Saved Jobs page
Then I should click on the selected job in SavedJobs page to apply
And I should click on the Apply button
Then I should be able to see a Job Successful message
