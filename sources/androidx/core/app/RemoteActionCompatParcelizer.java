package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p000.AbstractC0383;
import p000.C3514;
import p000.InterfaceC3793;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0383 abstractC0383) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC3793 interfaceC3793M837 = remoteActionCompat.f170;
        boolean z = true;
        if (abstractC0383.mo830(1)) {
            interfaceC3793M837 = abstractC0383.m837();
        }
        remoteActionCompat.f170 = (IconCompat) interfaceC3793M837;
        CharSequence charSequence = remoteActionCompat.f169;
        if (abstractC0383.mo830(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C3514) abstractC0383).f11633);
        }
        remoteActionCompat.f169 = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f166;
        if (abstractC0383.mo830(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C3514) abstractC0383).f11633);
        }
        remoteActionCompat.f166 = charSequence2;
        remoteActionCompat.f171 = (PendingIntent) abstractC0383.m831(remoteActionCompat.f171, 4);
        boolean z2 = remoteActionCompat.f167;
        if (abstractC0383.mo830(5)) {
            z2 = ((C3514) abstractC0383).f11633.readInt() != 0;
        }
        remoteActionCompat.f167 = z2;
        boolean z3 = remoteActionCompat.f168;
        if (!abstractC0383.mo830(6)) {
            z = z3;
        } else if (((C3514) abstractC0383).f11633.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f168 = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0383 abstractC0383) {
        abstractC0383.getClass();
        IconCompat iconCompat = remoteActionCompat.f170;
        abstractC0383.mo833(1);
        abstractC0383.m836(iconCompat);
        CharSequence charSequence = remoteActionCompat.f169;
        abstractC0383.mo833(2);
        Parcel parcel = ((C3514) abstractC0383).f11633;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f166;
        abstractC0383.mo833(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f171;
        abstractC0383.mo833(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f167;
        abstractC0383.mo833(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f168;
        abstractC0383.mo833(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
