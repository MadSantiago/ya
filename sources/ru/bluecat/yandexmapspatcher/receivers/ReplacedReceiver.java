package ru.bluecat.yandexmapspatcher.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import p000.AbstractC2539;
import p000.AbstractC2765;
import p000.AbstractC2776;
import p000.AbstractC3831;
import p000.C1443;
import p000.C2518;
import p000.C4441;
import ru.bluecat.yandexmapspatcher.p003ui.App;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ReplacedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (AbstractC3831.m6874(intent.getAction(), new C4441(new long[]{-7776682446864260311L, 6562537951613164330L, 4158007399379760833L, 6560376823750732916L, -540659206498456900L, -7884479455352241055L, 4653167435008195950L}).toString())) {
            App app = App.f407;
            C1443 c1443 = AbstractC2776.m5217().f409;
            c1443.getClass();
            C2518 c2518 = new C2518(c1443);
            c2518.m4661(Boolean.FALSE, AbstractC2539.f8457.f5219);
            SharedPreferences.Editor editor = c2518.f8351;
            if (editor != null) {
                editor.apply();
            }
            if (C1443.f4940 || c1443.f4943) {
                return;
            }
            try {
                AbstractC2765.m5147(c1443.f4945, c1443.m3070().concat(".xml"));
            } catch (Throwable unused) {
            }
        }
    }
}
