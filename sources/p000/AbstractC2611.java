package p000;

import android.app.Application;
import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.system.ErrnoException;
import android.system.Int64Ref;
import android.system.Os;
import android.system.OsConstants;
import android.text.PrecomputedText;
import android.util.MutableLong;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.io.FileDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: ۥۢؓۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2611 {

    /* JADX INFO: renamed from: ۥؗ */
    public static Method f8705;

    /* JADX INFO: renamed from: ۥۗ */
    public static Method f8706;

    /* JADX INFO: renamed from: ۥۣ */
    public static Object f8707;

    /* JADX INFO: renamed from: ۦؑ */
    public static Executable f8708;

    /* JADX INFO: renamed from: ۥؗ */
    public static FileDescriptor m4921(int i) {
        Class cls = Integer.TYPE;
        if (f8708 == null) {
            try {
                try {
                    f8708 = FileDescriptor.class.getDeclaredConstructor(cls);
                } catch (NoSuchMethodException unused) {
                    f8708 = FileDescriptor.class.getDeclaredMethod("setInt$", cls);
                }
            } catch (NoSuchMethodException unused2) {
            }
            f8708.setAccessible(true);
        }
        try {
            Executable executable = f8708;
            if (executable instanceof Constructor) {
                return (FileDescriptor) ((Constructor) executable).newInstance(Integer.valueOf(i));
            }
            FileDescriptor fileDescriptor = new FileDescriptor();
            ((Method) f8708).invoke(fileDescriptor, Integer.valueOf(i));
            return fileDescriptor;
        } catch (ReflectiveOperationException unused3) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public static void m4922(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    /* JADX INFO: renamed from: ۥُ */
    public static List m4923(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    /* JADX INFO: renamed from: ۥّ */
    public static String[] m4924(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    /* JADX INFO: renamed from: ۥْ */
    public static Uri m4925(Object obj) {
        return ((Icon) obj).getUri();
    }

    /* JADX INFO: renamed from: ۥٓ */
    public static long m4926(FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, MutableLong mutableLong, long j) throws ErrnoException {
        Int64Ref int64RefM9303 = null;
        if (Build.VERSION.SDK_INT >= 28) {
            if (mutableLong != null) {
                AbstractC5550.m9295();
                int64RefM9303 = AbstractC5550.m9303(mutableLong.value);
            }
            long jSendfile = Os.sendfile(fileDescriptor, fileDescriptor2, int64RefM9303, j);
            if (int64RefM9303 != null) {
                mutableLong.value = int64RefM9303.value;
            }
            return jSendfile;
        }
        try {
            Object obj = f8707;
            if (obj == null) {
                obj = Class.forName("libcore.io.Libcore").getField("os").get(null);
                f8707 = obj;
            }
            Method method = f8705;
            if (method == null) {
                method = obj.getClass().getMethod("sendfile", FileDescriptor.class, FileDescriptor.class, MutableLong.class, Long.TYPE);
                f8705 = method;
            }
            return ((Long) method.invoke(f8707, fileDescriptor, fileDescriptor2, mutableLong, Long.valueOf(j))).longValue();
        } catch (InvocationTargetException e) {
            throw ((ErrnoException) e.getTargetException());
        } catch (ReflectiveOperationException unused) {
            throw new ErrnoException("sendfile", OsConstants.ENOSYS);
        }
    }

    /* JADX INFO: renamed from: ۥٖ */
    public static void m4927(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static Handler m4928(Looper looper) {
        return Handler.createAsync(looper);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static String m4929() {
        return Application.getProcessName();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static Handler m4930(Looper looper) {
        return Handler.createAsync(looper);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static TextClassifier m4931(Context context, EnumC1383 enumC1383) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int iOrdinal = enumC1383.ordinal();
        if (iOrdinal == 0) {
            str = "edittext";
        } else {
            if (iOrdinal != 1) {
                C1078.m2275();
                return null;
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    /* JADX INFO: renamed from: ۦؚ */
    public static int m4932(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* JADX INFO: renamed from: ۦٌ */
    public static int m4933(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* JADX INFO: renamed from: ۦِ */
    public static String m4934(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    /* JADX INFO: renamed from: ۦٗ */
    public static boolean m4935(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    /* JADX INFO: renamed from: ۦٛ */
    public static int m4936(Object obj) {
        return ((Icon) obj).getResId();
    }

    /* JADX INFO: renamed from: ۦۗ */
    public static int m4937(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static void m4938(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    /* JADX INFO: renamed from: ۦۚ */
    public static int m4939(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    /* JADX INFO: renamed from: ۦۛ */
    public static long m4940(FileDescriptor fileDescriptor, Int64Ref int64Ref, FileDescriptor fileDescriptor2, Int64Ref int64Ref2, long j) throws ErrnoException {
        try {
            Method method = f8706;
            if (method == null) {
                method = Os.class.getMethod("splice", FileDescriptor.class, AbstractC5550.m9302(), FileDescriptor.class, AbstractC5550.m9302(), Long.TYPE, Integer.TYPE);
                f8706 = method;
            }
            return ((Long) method.invoke(null, fileDescriptor, int64Ref, fileDescriptor2, int64Ref2, Long.valueOf(j), 0)).longValue();
        } catch (InvocationTargetException e) {
            throw ((ErrnoException) e.getTargetException());
        } catch (ReflectiveOperationException unused) {
            throw new ErrnoException("splice", OsConstants.ENOSYS);
        }
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public static int m4941(Object obj) {
        return ((Icon) obj).getType();
    }

    /* JADX INFO: renamed from: ۦۨ */
    public static PrecomputedText.Params m4942(C3755 c3755) {
        return c3755.getTextMetricsParams();
    }
}
