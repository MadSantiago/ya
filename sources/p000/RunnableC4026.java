package p000;

import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* JADX INFO: renamed from: ۦّْؔٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC4026 implements Runnable {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f13425;

    public /* synthetic */ RunnableC4026(C0835 c0835, int i) {
        this.f13425 = 2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13425) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.f279;
                return;
            case 1:
                C2730 c2730 = ViewTreeObserverOnGlobalLayoutListenerC0850.f19554;
                synchronized (c2730) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        Object[] objArr = c2730.f9041;
                        int i3 = c2730.f9040;
                        int i4 = 0;
                        if (i2 < 30) {
                            while (i4 < i3) {
                                ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850 = (ViewTreeObserverOnGlobalLayoutListenerC0850) objArr[i4];
                                boolean showLayoutBounds = viewTreeObserverOnGlobalLayoutListenerC0850.getShowLayoutBounds();
                                Class cls = ViewTreeObserverOnGlobalLayoutListenerC0850.f19551;
                                viewTreeObserverOnGlobalLayoutListenerC0850.setShowLayoutBounds(AbstractC2774.m5182());
                                if (showLayoutBounds != viewTreeObserverOnGlobalLayoutListenerC0850.getShowLayoutBounds()) {
                                    viewTreeObserverOnGlobalLayoutListenerC0850.post(new RunnableC3027(viewTreeObserverOnGlobalLayoutListenerC0850, 2));
                                }
                                i4++;
                            }
                        } else {
                            while (i4 < i3) {
                                ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0851 = (ViewTreeObserverOnGlobalLayoutListenerC0850) objArr[i4];
                                viewTreeObserverOnGlobalLayoutListenerC0851.post(new RunnableC3027(viewTreeObserverOnGlobalLayoutListenerC0851, 3));
                                i4++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return;
            default:
                C2337.m4377();
                return;
        }
    }

    public /* synthetic */ RunnableC4026(int i) {
        this.f13425 = i;
    }

    public /* synthetic */ RunnableC4026(C2337 c2337) {
        this.f13425 = 3;
    }

    /* JADX INFO: renamed from: ۥۣ */
    private final void m7198() {
    }
}
