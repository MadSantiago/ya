package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* JADX INFO: renamed from: ۥؚؚؔۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0776 implements InterfaceC4237 {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f2807;

    public /* synthetic */ C0776(int i) {
        this.f2807 = i;
    }

    @Override // p000.InterfaceC4237
    /* JADX INFO: renamed from: ۦٌ */
    public final Object mo1670(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.f2807;
        C2358 c2358 = C2358.f7817;
        switch (i) {
            case 0:
                InterfaceC0647 interfaceC0647 = (InterfaceC0647) obj;
                InterfaceC3320 interfaceC3320 = (InterfaceC3320) obj2;
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) obj3;
                C5362 c5362 = (C5362) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                int i2 = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? c5362.m8963(interfaceC0647) : c5362.m8977(interfaceC0647) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i2 |= (iIntValue & 64) == 0 ? c5362.m8963(interfaceC3320) : c5362.m8977(interfaceC3320) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i2 |= c5362.m8977(interfaceC4448) ? 256 : 128;
                }
                if (!c5362.m9011(i2 & 1, (i2 & 1171) != 1170)) {
                    c5362.m8982();
                } else {
                    AbstractC1211.m2579((C0843) interfaceC0647, interfaceC3320, interfaceC4448, c5362, i2 & 1022);
                }
                break;
            case 1:
                InterfaceC0647 interfaceC0648 = (InterfaceC0647) obj;
                InterfaceC3320 interfaceC3321 = (InterfaceC3320) obj2;
                InterfaceC4448 interfaceC4449 = (InterfaceC4448) obj3;
                C5362 c5363 = (C5362) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? c5363.m8963(interfaceC0648) : c5363.m8977(interfaceC0648) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= (iIntValue2 & 64) == 0 ? c5363.m8963(interfaceC3321) : c5363.m8977(interfaceC3321) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i3 |= c5363.m8977(interfaceC4449) ? 256 : 128;
                }
                if (!c5363.m9011(i3 & 1, (i3 & 1171) != 1170)) {
                    c5363.m8982();
                } else {
                    AbstractC1211.m2579((C0843) interfaceC0648, interfaceC3321, interfaceC4449, c5363, i3 & 1022);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j = ((C3346) obj5).f11197;
                String string = ((CharSequence) obj4).subSequence(C3346.m6109(j), C3346.m6108(j)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return c2358;
    }
}
