DELETE FROM schedules;
DELETE FROM class_groups;
DELETE FROM subjects;
INSERT INTO subjects --
    (subject_id, career_id, subject_code, credits, curriculum, subject_name)
VALUES --
    (
    1,
    1,
    '1053486524-B',
    5,
    'curriculum-1',
    'Introducción a la criptografía y la seguridad informática'
),
(
    2,
    1,
    '1053486524-C',
    5,
    'curriculum-1',
    'Ingeniería de Software I'
),
(
    3,
    1,
    '1053486524-D',
    5,
    'curriculum-1',
    'Ingeniería de Software II'
),
(
    4,
    1,
    '1053486524-E',
    5,
    'curriculum-1',
    'Arquitectura de Software'
);
INSERT INTO class_groups (group_id, max_capacity, teacher_id, subject_id)
VALUES (
        'cca4c365-befb-4d4b-bd42-d9b92384a57d',
        25,
        '2006bc4f-db29-4248-8025-d36348017d2d',
        1
    ),
    (
        'd0b5c4b5-5b1f-4b2b-9b2c-9b2c9b2c9b2c',
        25,
        '2006bc4f-db29-4248-8025-d36348017d2d',
        1
    ),
    (
        'd0b5c4b5-5b1f-4b2b-9b2c-9b2c9b2c9b2d',
        30,
        '2006bc4f-db29-4248-8025-d36348017d2d',
        2
    ),
    (
        'd0b5c4b5-5b1f-4b2b-9b2c-9b2c9b2c9b2e',
        30,
        '2006bc4f-db29-4248-8025-d36348017d2d',
        3
    ),
    (
        'a1933e14-95c6-4add-9a74-2cc0b83d554d',
        40,
        '2006bc4f-db29-4248-8025-d36348017d2d',
        4
    ),
    (
        '2d3c0e52-a09c-47db-8c42-8028f6e9856c',
        40,
        '2006bc4f-db29-4248-8025-d36348017d2d',
        4
    );
INSERT INTO schedules (
        schedule_id,
        day,
        start_time,
        end_time,
        classroom,
        building,
        group_id
    )
VALUES --
    -- Monday-Wednesday 7-9 401(Viejo)-103
    (
        1,
        1,
        '07:00:00',
        '09:00:00',
        103,
        401,
        'cca4c365-befb-4d4b-bd42-d9b92384a57d'
    ),
    (
        2,
        3,
        '07:00:00',
        '09:00:00',
        103,
        401,
        'cca4c365-befb-4d4b-bd42-d9b92384a57d'
    ),
    -- Monday-Wednesday 9-11 453(Aulas de Ingeniería)-115
    (
        3,
        1,
        '09:00:00',
        '11:00:00',
        115,
        453,
        'd0b5c4b5-5b1f-4b2b-9b2c-9b2c9b2c9b2c'
    ),
    (
        4,
        3,
        '09:00:00',
        '11:00:00',
        115,
        453,
        'd0b5c4b5-5b1f-4b2b-9b2c-9b2c9b2c9b2c'
    ),
    -- Tuesday-Thursday 7-9 401(Viejo)-204
    (
        5,
        2,
        '07:00:00',
        '09:00:00',
        204,
        401,
        'd0b5c4b5-5b1f-4b2b-9b2c-9b2c9b2c9b2d'
    ),
    (
        6,
        4,
        '07:00:00',
        '09:00:00',
        204,
        401,
        'd0b5c4b5-5b1f-4b2b-9b2c-9b2c9b2c9b2d'
    ),
    -- Tuesday-Thursday 2-4 454(CyT)-403
    (
        7,
        2,
        '14:00:00',
        '16:00:00',
        403,
        454,
        'd0b5c4b5-5b1f-4b2b-9b2c-9b2c9b2c9b2e'
    ),
    (
        8,
        4,
        '14:00:00',
        '16:00:00',
        403,
        454,
        'd0b5c4b5-5b1f-4b2b-9b2c-9b2c9b2c9b2e'
    ),
    -- Tuesday-Thursday 9-11 401(Viejo)-204
    (
        9,
        2,
        '09:00:00',
        '11:00:00',
        204,
        401,
        'a1933e14-95c6-4add-9a74-2cc0b83d554d'
    ),
    (
        10,
        4,
        '09:00:00',
        '11:00:00',
        204,
        401,
        'a1933e14-95c6-4add-9a74-2cc0b83d554d'
    ),
    -- Tuesday-Thursday 11-1 401(Viejo)-204
    (
        11,
        2,
        '11:00:00',
        '13:00:00',
        204,
        401,
        '2d3c0e52-a09c-47db-8c42-8028f6e9856c'
    ),
    (
        12,
        4,
        '11:00:00',
        '13:00:00',
        204,
        401,
        '2d3c0e52-a09c-47db-8c42-8028f6e9856c'
    );