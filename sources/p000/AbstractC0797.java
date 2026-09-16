package p000;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Path;
import android.util.LongSparseArray;
import android.view.DisplayCutout;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ۥًؚؖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0797 {
    /* JADX INFO: renamed from: ۥؗ */
    public static Path m1701(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    /* JADX INFO: renamed from: ۥُ */
    public static int m1702(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.f267;
        switch (stopReason) {
            case 0:
            case 1:
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
            case C4261.LONG_FIELD_NUMBER /* 4 */:
            case C4261.STRING_FIELD_NUMBER /* 5 */:
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public static void m1703(ViewOnAttachStateChangeListenerC4316 viewOnAttachStateChangeListenerC4316, long[] jArr, Consumer consumer) {
        C3129 c3129;
        for (long j : jArr) {
            C1307 c1307 = (C1307) viewOnAttachStateChangeListenerC4316.m7610().m9571((int) j);
            if (c1307 != null && (c3129 = c1307.f4492) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(viewOnAttachStateChangeListenerC4316.f14275.getAutofillId(), c3129.f10473);
                Object objM6027 = c3129.f10476.f8490.m6027(AbstractC2771.f9198);
                if (objM6027 == null) {
                    objM6027 = null;
                }
                List list = (List) objM6027;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new C1249(AbstractC0844.m1757(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m1704(ViewOnAttachStateChangeListenerC4316 viewOnAttachStateChangeListenerC4316, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        C1307 c1307;
        C3129 c3129;
        InterfaceC4745 interfaceC4745;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseM8099 = AbstractC4759.m8099(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseM8099 != null && (value = viewTranslationResponseM8099.getValue("android:text")) != null && (text = value.getText()) != null && (c1307 = (C1307) viewOnAttachStateChangeListenerC4316.m7610().m9571((int) jKeyAt)) != null && (c3129 = c1307.f4492) != null) {
                Object objM6027 = c3129.f10476.f8490.m6027(AbstractC0208.f777);
                if (objM6027 == null) {
                    objM6027 = null;
                }
                C0078 c0078 = (C0078) objM6027;
                if (c0078 != null && (interfaceC4745 = (InterfaceC4745) c0078.f14720) != null) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public static void m1705(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static EdgeEffect m1706(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static float m1707(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static float m1708(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
