package p000;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: renamed from: ۦُؓۙ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3900 extends Handler {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3900 f13023 = new C3900();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i;
        int iMin;
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC3339.f11171;
        String loggerName = logRecord.getLoggerName();
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i = 5;
        } else {
            i = logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = logRecord.getMessage();
        Throwable thrown = logRecord.getThrown();
        String strM9761 = (String) AbstractC3339.f11170.get(loggerName);
        if (strM9761 == null) {
            strM9761 = AbstractC0684.m9761(23, loggerName);
        }
        if (Log.isLoggable(strM9761, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iM1521 = AbstractC0684.m1521('\n', i2, 4, message);
                if (iM1521 == -1) {
                    iM1521 = length;
                }
                while (true) {
                    iMin = Math.min(iM1521, i2 + 4000);
                    Log.println(i, strM9761, message.substring(i2, iMin));
                    if (iMin >= iM1521) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
