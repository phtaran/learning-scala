
def and(x: Boolean, y: => Boolean) = if (!x) false else y

def or(x: Boolean, y: => Boolean) = if (x) true else y

assert(and(true, true))
assert(!and(true, false))
assert(!and(false, true))
assert(!and(false, false))

assert(or(true, true))
assert(or(true, false))
assert(or(false, true))
assert(!or(false, false))
