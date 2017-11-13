CREATE TABLE users(
  user_id serial PRIMARY KEY,
  username VARCHAR(30) UNIQUE NOT NULL,
  first_name VARCHAR(30),
  last_name VARCHAR(30),
  email VARCHAR(100) UNIQUE NOT NULL,
  phone_number VARCHAR(30)
);

CREATE TABLE unverified_users(
  unverified_user_id serial PRIMARY KEY,
  email VARCHAR(100) UNIQUE NOT NULL,
  verification_code INTEGER NOT NULL
);

CREATE TABLE following(
  user_id INTEGER REFERENCES users(user_id),
  follower_id INTEGER REFERENCES users(user_id)
);

CREATE TABLE settings(
  settings_id serial PRIMARY KEY,
  user_id INTEGER REFERENCES users(user_id),
  key VARCHAR(30) NOT NULL,
  value VARCHAR(30) NOT NULL
);

CREATE TABLE status(
  status_id serial PRIMARY KEY,
  owner_id INTEGER REFERENCES users(user_id),
  beacon_status VARCHAR(10) NOT NULL,
  status VARCHAR(30),
  time_created DATE NOT NULL
);


