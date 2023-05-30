class Databaseelperf(var)context: Context): SQLiteOpenkelper(
    context, DATABASE_NANE, factory: NULL, DATABASE_VERSION
)

fun addAccount(email:String, name:String, level:String, password:String){
    val db = this.readabledatabase

    val values = ContentValues()
    Values. put (COLUMN_EMATL, email)
    values. put (COLUMN_NANE, name)
    Values. put (COLUMN_LEVEL, level)
    Values. put (COLUMN_PASSWORD, password)

    val result = db.insert(TABLE_ACCOUNT, nullColumnHack null, values)
//show_message
if (result==(0).toLong)){
        Toast.makeText(context, tet "Register Failed”, Toast.LENGTH_SHORT).show()
        }
else {
    Toast.makeText (context, tec: "Register Success, " +
            “please login using your new account”, Toast.LENGTH_SHORT) .show()

}
db.close()

}


//instance text sesuaikan deklarasi yang anda berikan
val txtEmail: EditText findViewById(R.id.registerEmail)

val txtName: EditText = findViewById(R.id.registerPersonName)
val txtlevel: EditText = findviewById(R.id.registerLevel)

val txtPassword: EditText = findViewById(R.id.registerPassword)
//instance button register

val btnRegister : Button = findViewById(R.id.buttonRegisterAccount)


//object class databoseHelper
val databaseHelper = DatabaseHelper( contest this)
//dectare data

val email:String = txtEmail.text.tostring().trin()

val name:String = txtName.text.toString().trin()

val level:string = txtlevel.text.tostring().trin()

val password:String = txtPassword. text.tostring().trin()

//check data -> email sudah terdoftar atau belum
val data:String = databaseelper. checkData(enail)
//ika belun terdartar
if (data == nulL{
//insert data
    databaseHelper. addAccount (
        email, name, level, password)

//show Loginactivity
val intentLogin = Intent( packageContext: thisgRegisterActivity,
    LoginActivity: :class. java)
    startActivity(intentLogin)
else{
//jika email telah terdaftar
    Toast.makeText( context: this@RegisterActivity, tet "Register failed.” +
        "Your email already registered”, Toast.LENGTH_SHORT).show()

    }
}
