package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: ۥؚؓۥْ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0775 extends BroadcastReceiver {

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f2805;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f2806;

    public C0775(C5371 c5371) {
        this.f2806 = 3;
        this.f2805 = c5371;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.f2806;
        Object obj = this.f2805;
        switch (i) {
            case 0:
                ((AbstractC0057) obj).mo4630();
                break;
            case 1:
                C0330 c0330 = (C0330) obj;
                switch (c0330.f1231) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            C1984.m3874().m3878(AbstractC2614.f8716, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        c0330.m7117(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        c0330.m7117(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        c0330.m7117(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        c0330.m7117(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            C1984.m3874().m3878(AbstractC2624.f8727, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int iHashCode = action2.hashCode();
                                if (iHashCode != -1980154005) {
                                    if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        c0330.m7117(Boolean.FALSE);
                                    }
                                    break;
                                } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    c0330.m7117(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            C1984.m3874().m3878(AbstractC2743.f9076, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode2 = action3.hashCode();
                                if (iHashCode2 != -1181163412) {
                                    if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        c0330.m7117(Boolean.TRUE);
                                    }
                                    break;
                                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    c0330.m7117(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                }
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                if (context != null && intent != null) {
                    ((InterfaceC2609) obj).mo1173(this, context, intent);
                    break;
                }
                break;
            default:
                C5371 c5371 = (C5371) obj;
                if (intent != null) {
                    String action4 = intent.getAction();
                    if (action4 != null) {
                        int iHashCode3 = action4.hashCode();
                        if (iHashCode3 != -1928239649) {
                            if (iHashCode3 == 1279883384 && action4.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                                C3610 c3610 = c5371.f17717;
                                C5371.m9020(c3610);
                                c3610.f12023.m9432("[sgtm] App Receiver notified batches are available");
                                C3644 c3644 = c5371.f17733;
                                C5371.m9020(c3644);
                                c3644.m6515(new RunnableC3365(28, this));
                            }
                            break;
                        } else if (action4.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                            C0237.m498();
                            if (c5371.f17715.m1162(null, AbstractC4936.f16258)) {
                                C3610 c3611 = c5371.f17717;
                                C5371.m9020(c3611);
                                c3611.f12023.m9432("App receiver notified triggers are available");
                                C3644 c3645 = c5371.f17733;
                                C5371.m9020(c3645);
                                c3645.m6515(new RunnableC3365(29, c5371));
                                break;
                            }
                        }
                        C3610 c3612 = c5371.f17717;
                        C5371.m9020(c3612);
                        c3612.f12022.m9432("App receiver called with unknown action");
                    } else {
                        C3610 c3613 = c5371.f17717;
                        C5371.m9020(c3613);
                        c3613.f12022.m9432("App receiver called with null action");
                    }
                } else {
                    C3610 c3614 = c5371.f17717;
                    C5371.m9020(c3614);
                    c3614.f12022.m9432("App receiver called with null intent");
                }
                break;
        }
    }

    public /* synthetic */ C0775(int i, Object obj) {
        this.f2806 = i;
        this.f2805 = obj;
    }
}
