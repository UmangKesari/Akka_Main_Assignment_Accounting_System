package Models
import java.util.Date

case class BillerToUserTransfer(billerCategory: String, billerName: String, accountNumber: Long, transcationDate: Date,
                                amountPaid: Double,totalPaidAmount: Double, totalIterations: Int = 0, executedIterations: Int=0))