require_relative "../UserStories/US01"
require "test/unit"

class TestUS01 < Test::Unit::TestCase

    def test_simple_addition
        assert_equal([], US01.new(2, 2, 4))
    end

    def test_complex_addition
        assert_equal([], US01.new(158, 413, 571))
    end

    def test_wrong_addition
        assert_equal([2, 2, 5], US01.new(2, 2, 5))
    end

end