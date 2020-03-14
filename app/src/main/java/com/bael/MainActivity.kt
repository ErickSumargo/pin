package com.bael

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bael.model.Movie
import com.bael.pin.base.Pin
import com.bael.util.Constant.OBJECT1_KEY
import com.bael.util.Constant.OBJECT2_KEY
import com.bael.util.Constant.OBJECT3_KEY
import com.bael.util.Constant.OBJECT4_KEY

/**
 * Created by ericksumargo on 10/03/20.
 */
class MainActivity : AppCompatActivity() {

    // 1. Less Verbose
    private var object1: Int by Pin(key = OBJECT1_KEY, defaultValue = -1)

    // 2. Support Complex Object
    private var object2: Movie by Pin(key = OBJECT2_KEY, defaultValue = Movie())

    // 3. Support Nullability
    private var object3: Movie? by Pin(key = OBJECT3_KEY, defaultValue = null)

    /**
     * 4. Compile Time Safety
     * Below lint will be error, the type should be declared as nullable since the default set null
     * private var object4: Movie by Pin(key = "object4_key", default = null)
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Read
         * 1. Read it like a normal variable
         * 2. Seriously, that's all!
         */
        println(object1)
        println(object2)
        println(object3)

        /**
         * Write
         * 1. Update it like a normal variable assignment
         * 2. Seriously, that's all!
         */
        object1 = 1
        object2 = Movie()
        object3 = null
    }
}
